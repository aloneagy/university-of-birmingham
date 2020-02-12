/**
 * There are some problems in the original code:
 * 1. Some useful global variables are never assigned or used.
 * 2. The main method does not assign the global variable a,b,f and n.
 * 3. The functionToPolygon method and the functionToPolyline method do not compute the corresponding x-axis values and y-axis values,
 *    so that the points can not correctly be in the corresponding axis position.
 * 4. The functionToPolygon method does not compute the start and end points of the Polygon,
 *    so that the result Polygon is not a closed Polygon.
 * 5. The functionToPolygon method does not compute the max value and the min value of y, 
 *    so that we cannot know the range of remains unknown.
 * 6. The max and min of variable are never computed and assigned.
 * 7. The computation of y-axis value is wrong in the drawXAxis method.
 * 8. The computation of x-axis value is wrong in the drawYAxis method.
 *  @version 2019-12-03
 *  @author TIANHE YANG
 */
public class Problems {
}
