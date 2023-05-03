package designPattterns.strategyPattern.smallProject;

public class Ryu extends fighter{
    public Ryu(kickBehavior kickBehavior,
            jumpBehavior jumpBehavior) {
        super(kickBehavior, jumpBehavior);
    }
    void kick(){
        
    }
    @Override
    public void display() {
        System.out.println("Ryu");
    }
}
