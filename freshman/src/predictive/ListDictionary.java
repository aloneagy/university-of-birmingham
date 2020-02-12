package predictive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ListDictionary implements Dictionary{
    private static ArrayList<WordSig> dictionary;

    public ListDictionary(String path){
        dictionary = new ArrayList<WordSig>();
        String line;
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(path));
        }catch (FileNotFoundException e){
            System.out.println("file is not found");
        }
        while (scanner.hasNext()){
            line = scanner.nextLine().toLowerCase();
            if (PredictivePrototype.isValidWord(line)){
                String signature = PredictivePrototype.wordToSignature(line);
                WordSig wordSigPair = new WordSig(signature,line);
                dictionary.add(wordSigPair);
            }
        }
        Collections.sort(dictionary);
        if (null != scanner){
            scanner.close();
        }
    }
    @Override
    public Set signatureToWords(String signature){
        HashSet result = new HashSet<>();
        if (signature.length() == 0){
            return result;
        }
        int index = Collections.binarySearch(dictionary,new WordSig(signature,null));
        if (index >= 0 && dictionary.get(index).getSignature().equals(signature)){
        result.add(dictionary.get(index).getWords());
        for (int i = index - 1; i >= 0; i--){
            if (dictionary.get(i).getSignature().equals(signature)){
                result.add(dictionary.get(i).getWords());
            }
        }
        }
        return result;
    }

}
