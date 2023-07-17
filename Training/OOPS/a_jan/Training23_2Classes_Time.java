package Java.Training.OOPS.a_jan;
// Passing object as an argument
class Time
{
    int hr, min, sec;
    void fun (int a, int b, int c)
    {
        hr = a;
        min = b;
        sec = c;
    }
    void show()
    {
        System.out.println(hr + " : " + min + " : " + sec);
    }

    void reset (){
        hr = hr - 24;
    }

    Time sum(Time t)
    {
        // System.out.println(hr); will print t1
        // System.out.println(t2hr); will print t2
        Time obj = new Time();
        obj.sec = (sec + t.sec) % 60;
        int s = (sec + t.sec) / 60;
        obj.min = (min + s + t.min) % 60;
        int h = (min + s + t.min) / 60;
        obj.hr = hr + h + t.hr;
        if(obj.hr>24)
        {
            obj.reset ();
        }
        return obj;
    }
}
public class Training23_2Classes_Time
{
    public static void main(String[] args)
    {
        Time t1 = new Time();
        Time t2 = new Time();
        Time t3 = new Time();

        t1.fun(23, 59, 59);
        t2.fun(23, 59, 59);
        t1.show();
        t2.show();
        //t3.hr = t1.hr+ t2.hr;
        //t3.min = t1.min + t2.min;
        //t3.sec = t1.sec + t2.sec;
        t3=t1.sum(t2);
        t3.show();
    }
}
