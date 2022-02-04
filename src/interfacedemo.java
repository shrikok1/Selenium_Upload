

public class interfacedemo implements maininterface,maininterface2 {

public static void main(String[] args) {
// TODO Auto-generated method stub
	maininterface a= new interfacedemo();
a.redStop();
a.FlashYellow();
a.greenGo();

interfacedemo at=new interfacedemo();
maininterface2 ct=new interfacedemo();
at.walkonsymbol();
ct.Trainsymbol();


}

@Override
public void redStop() {
// TODO Auto-generated method stub
System.out.println(" redstop implementation");
}
public void walkonsymbol()
{
System.out.println("walking");
}
@Override
public void FlashYellow() {
// TODO Auto-generated method stub
System.out.println(" flash yellow implementation");
//code
}

@Override
public void greenGo() {
// TODO Auto-generated method stub
System.out.println(" Green go implementation");
}

@Override
public void Trainsymbol() {
// TODO Auto-generated method stub

}

}

//CentralTraffic

