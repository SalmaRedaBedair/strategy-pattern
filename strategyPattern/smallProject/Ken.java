package designPattterns.strategyPattern.smallProject;

public class Ken extends fighter{
    public Ken(kickBehavior kickBehavior,
            jumpBehavior jumpBehavior) {
        super(kickBehavior, jumpBehavior);
    }

    @Override
    public void display() {
        System.out.println("Ken");
    }

    
}
