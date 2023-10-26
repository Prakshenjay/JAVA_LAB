public class Classes {

    static class Rectangle
    {
        private
                int length;
                int breadth;
        public
                void getdata(int x, int y)
                {
                    length = x;
                    breadth = y;
                }

                void printarea()
                {
                    System.out.println("Area : " + length*breadth);
                }
    }

    public static void main(String[] args) {

        Rectangle obj1 = new Rectangle();

        obj1.getdata(10,8);

        obj1.printarea();

        System.out.println(obj1.length);
    }
}
