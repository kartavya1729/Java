
// public class multiple_exceptions {

public class MultipleExceptionDemo 
{
    public static void main(String[] args) 
    {
        try
        {
            int[] arr = {1,2,3};
            System.out.println(arr[2]);
            //normal flow
            System.out.println(arr[1]);
            //object of ArithmaticException is created
            int val = 10 / 0;
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.toString());
        }

        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        } 
        
        catch (Exception e) {
            e.printStackTrace();
        }
        
        //compiler error-> all exceptions will be caught by first catch block no need of other cathc block
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//        catch(ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println(e.toString());
//        }
//        catch(ArithmeticException e)
//        {
//            System.out.println(e.getMessage());
//        }
    }
}
    

