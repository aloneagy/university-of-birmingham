//import WS2_2.WS2_2.List;
//import WS2_2.Tree;
//
//public class question {
//
//
////    static int depth(WS2_2.Tree<Integer> a, int x) {
////        if (a.isEmpty()) {
////            return -1;
////        }
////        if(a.getValue().equals(x)){
////            return 0;
////        }
////        if(a.getValue()>x) {
////            if(a.getLeft().isEmpty()&&a.getRight().isEmpty()){
////                return -1;
////            }
////            return 1 + depth(a.getLeft(), x);
////        }else if(a.getValue()<x){
////            if (a.getLeft().isEmpty()&&a.getRight().isEmpty()){
////                return -1;
////            }else {
////                return 1+depth(a.getRight(),x);
////            }
////        }
////        return 0;
////
////    }
//static <E> WS2_2.List<E> preorder(WS2_2.Tree<E> a) {
//    if (a.isEmpty()) {
//        return new WS2_2.List<E>();
//    }
//    if (a.getLeft().isEmpty()) {
//        return new WS2_2.List<E>(a.getValue(), preorder(a.getRight()));
//    }
//    return new WS2_2.List(a.getValue(), new WS2_2.List(preorder(a.getLeft()), preorder(a.getRight())));
//}
//}
//        if (a.isEmpty()) {
////            return new WS2_2.Tree<Integer>();
////        }
////        if(a.getValue().equals(x)){
////            if(a.getLeft().isEmpty()&&a.getRight().isEmpty()) {
////                return new WS2_2.Tree<Integer>();
////            }else if(a.getLeft().isEmpty()){
////                return new WS2_2.Tree<Integer>(a.getRight().getValue(),delete(a.getRight().getLeft(),x),a.getRight().getRight());
////            }else {
////                return new WS2_2.Tree<Integer>(a.getLeft().getValue(),delete(a.getLeft().getLeft(),x),a.getRight());
////            }
////        }
////        if(a.getValue()>x){
////            return new WS2_2.Tree<Integer>(a.getValue(),delete(a.getLeft(),x),a.getRight());
////        }else {
////            return new WS2_2.Tree<Integer>(a.getValue(),a.getLeft(),delete(a.getRight(),x));
////        }