package com.day1.ex2.object_orientation2.solid.srp;
class JdbcConn{}
class JMsConn{}
class XMLConn{}


class ConnectionFactroy{

    public JMsConn getJMsConn(){return new JMsConn();}
    public XMLConn getXMLConn(){return new XMLConn();}

}
public class A_DemoSRP {
    public static void main(String[] args) {

    }
}
