package designPattterns.strategyPattern.smallProject;

public class lightingKick implements kickBehavior {

    @Override
    public void kick() {
        System.out.println("Lighting kick");
    }
    
}
