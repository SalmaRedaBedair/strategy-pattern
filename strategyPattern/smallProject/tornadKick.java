package designPattterns.strategyPattern.smallProject;

public class tornadKick implements kickBehavior {

    @Override
    public void kick() {
        System.out.println("Tornado kick");
    }
    
}
