import java.io.*;
class No {
  public int item;
  public No ant;
}
class PilhaSE {
  private No topo;
  public PilhaSE() { topo = null; }
  public boolean empty() { return (topo == null); }
  public int top()  { return topo.item; }
  public void pop() { if (!empty()) topo = topo.ant; }
  public void push(int valor) {
      No novo = new No();
      novo.item = valor;
      novo.ant = topo;
      topo = novo;
  }
} 
class PilhaExpressoes {
      public static void main(String[] args) throws IOException { 
          PilhaSE p = new PilhaSE();
          int arg1, arg2; 
          char c; 
          String s = lerStr();
          for (int i=0; i<s.length(); i++) {
              c = s.charAt(i);
              if (Character.isDigit(c))
                  p.push(Character.digit(c,10));
              
              
              
              
              
              
              
                  /* Aqui é os ifs para realizar as contas

              cada vez que ele acha um sinal de operaçao
              ele pega os 2 ultimos numeros, faz a operacao e empilha de novo
               */
              
                  else if(c=='+') {
                  arg1 = p.top(); p.pop();
                  arg2 = p.top(); p.pop();
                  p.push(arg1+arg2);
              }
              else if(c=='*') {
                  arg1 = p.top(); p.pop();
                  arg2 = p.top(); p.pop();
                  p.push(arg1*arg2);
              }
              else if(c=='-') {
                  arg1 = p.top(); p.pop();
                  arg2 = p.top(); p.pop();
                  p.push(arg1-arg2);
              }
              else if(c=='/') {
                  arg1 = p.top(); p.pop();
                  arg2 = p.top(); p.pop();
                  p.push(arg1/arg2);
              }
              else if(c=='^') {
                  arg1 = p.top(); p.pop();
                  arg2 = p.top(); p.pop();
                  p.push((int) Math.pow(arg1,arg2));
              }
          }
          System.out.println("Resposta = " + p.top());
          p.pop();
      }  
      public static String lerStr() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
      }
}