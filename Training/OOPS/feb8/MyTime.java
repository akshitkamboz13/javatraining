package Java.Training.OOPS.feb8;

public class MyTime
{
    int hour; // with the domain of values between 0 to 23.
    private int minute; // with the domain of values between 0 to 59.
    private int second; // with the domain of values between 0 to 59
    public MyTime( )
    {
        hour = 0; minute = 0; second =0;
    }
    //Constructor. Initializes a new instance of the MyTime class.
    public MyTime ( int hour, int minute, int second )
    {
        if (second>=0 && second <60)
        {
            this.second = second;
        }
        else
        {
            this.second = 0;
        }
        if (minute>=0 && minute <60)
        {
            this.minute = minute;
        }
        else
        {
            this.minute = 0;
        }
        if (hour>=0 && hour <23)
        {
            this.hour = hour;
        }
        else
        {
            this.hour =0;
        }
        //Constructor. Initializes a new instance of the MyTime class and sets the three instance variables to the respective
        //values given in the input.
    }
    public void SetTime( int hour, int minute, int second )
    {
        if (second>=0 && second <60)
        {
            this.second = second;
        }
        else
        {
            System.out.println("Enter the value for second between 0 and 59");
        }
        if (minute>=0 && minute <60)
        {
            this.minute = minute;
        }
        else
        {
            System.out.println("Enter the value for minute between 0 and 59");
        }
        if (hour>=0 && hour <23)
        {
            this.hour = hour;
        }
        else
        {
            System.out.println("Enter the value for hour between 0 and 59");
        }
        //Sets the three instance variables to the respective values given in the input.

    }
    public void SetHour( int hour )
    {
        if (hour>=0 && hour <23)
        {
            this.hour = hour;
        }
        else
        {
            System.out.println("Enter the value for hour between 0 and 59");
        }
        //Mutator method. Gives the specified value to the instance variable hour.

    }
    public void SetMinute( int minute )
    {
        if (minute>=0 && minute <60)
        {
            this.minute = minute;
        }
        else
        {
            System.out.println("Enter the value for minute between 0 and 59");
        }
        //Mutator method. Gives the specified value to the instance variable minute.

    }
    public void SetSecond( int second )
    {
        if (second>=0 && second <60)
        {
            this.second = second;
        }
        else
        {
            System.out.println("Enter the value for second between 0 and 59");
        }
        //Mutator method. Gives the specified value to the instance variable second.

    }
    public int GetHour( )
    {
        return this.hour;
        //Accessor method. Gets the value of the instance variable hour.

    }
    public int GetMinute( )
    {
        return this.minute;
        //Accessor method. Gets the value of the instance variable minute.

    }
    public int GetSecond( )
    {
        return this.second;
        // Accessor method. Gets the value of the instance variable second.

    }
    String ToString( )
    {
        String hour = Integer.toString(this.hour); // String.valueOf(this.hour);
        String minute =  Integer.toString(this.minute); // String.valueOf(this.minute);
        String second = Integer.toString(this.second); // String.valueOf(this.second);

        return hour + ":" + minute + ":" + second;

        //Returns a string that represents the current object. ToString() is the major formatting method in the .NET
        //Framework. It converts an object to its string representation so that it is suitable for display. This method must
        //return the time stored in the MyTime as a string formatted to "HH:MM:SS".

    }
    MyTime NextSecond( )
    {
        this.second +=1;
        if (this.second>59)
        {
            this.second=0;
            this.minute+=1;
            if (this.minute>59)
            {
                this.minute = 0;
                this.hour +=1;
                if (this.hour>23)
                {
                    this.hour=0;
                }
            }
        }
        return this;
        //Updates this instance of MyTime to the next second and returns this instance.

    }
    MyTime NextMinute( )
    {
        this.minute +=1;
        if (this.minute>59)
        {
            this.minute=0;
            this.hour+=1;
            if (this.hour>23)
            {
                this.hour=0;
            }
        }
        return this;
        //Updates this instance of MyTime to the next minute and returns this instance.

    }
    MyTime NextHour( )
    {
        this.hour +=1;
        if (this.hour>23)
        {
            this.hour=0;
        }
        return this;
        //Updates this instance of MyTime to the next hour and returns this instance.

    }
    MyTime PreviousSecond( )
    {
        this.second -=1;
        if (this.second<0)
        {
            this.second=59;
            this.minute-=1;
            if (this.minute<0)
            {
                this.minute = 59;
                this.hour -=1;
                if (this.hour<0)
                {
                    this.hour=23;
                }
            }
        }
        return this;
        //Updates this instance of MyTime to the previous second and returns this instance.

    }
    MyTime PreviousMinute( )
    {
        this.minute-=1;
        if (this.minute<0)
        {
            this.minute = 59;
            this.hour -=1;
            if (this.hour<0)
            {
                this.hour=23;
            }
        }
        return this;
        //Updates this instance of MyTime to the previous minute and returns this instance.

    }

    MyTime PreviousHour( )
    {
        this.hour -=1;
        if (this.hour<0)
        {
            this.hour=23;
        }
        return this;
        //Updates this instance of MyTime to the previous hour and returns this instance.

    }
    public static void main(String arg[])
    {
        System.out.println("Hello World");
        MyTime obj = new MyTime();
        MyTime objtemp = new MyTime();
        obj.SetTime(00 , 00 , 00);
        System.out.println(obj.ToString());
        objtemp  = obj.PreviousSecond();
        System.out.println(objtemp.ToString());
    }
}