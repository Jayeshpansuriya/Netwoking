import java.net.*;

class inetAddress{

    public static void main(String[] args) throws UnknownHostException{
        InetAddress Address = InetAddress.getLocalHost();
        System.out.println(Address);
        Address = getByName("www.w3schools.com");
        System.out.println(Address);
        InetAddress sw[] = InetAddress.getAllByName("www.googal.com");
        for(int i=0;i<sw.length;i++){
            System.out.println(sw[i]);
        }
    }
                private static InetAddress getByName(String string) {
        return null;
    }

    }
