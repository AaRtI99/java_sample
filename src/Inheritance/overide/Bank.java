package Inheritance.overide;

class Bank
{
    int rateofIntrest()
    {
        return 0;
    }

//    String bankName()
//    {
//        return "BankName" ;
//    }
}

class SBI extends Bank
{
    int rateofintert()
    {
        return 7;
    }

//    String bankName()
//    {
//        return "SBI" ;
//    }
}

class Axis extends Bank
{
    int rateofintrest()
    {
        return 8;
    }
}

class ICICI extends Bank
{
    int rateofinterest()
    {
        return 9;
    }
}

class calculateinterest
{
    public static void main(String[] args)
    {

        SBI s = new SBI();
        Axis a = new Axis();
        ICICI i = new ICICI();

        System.out.println("SBI rate intres " + s.rateofIntrest());
        System.out.println("Axis rate intres " + i.rateofinterest());
        System.out.println("ICICI rate intres " + a.rateofIntrest());

    }
}

