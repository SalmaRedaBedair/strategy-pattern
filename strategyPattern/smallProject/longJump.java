package designPattterns.strategyPattern.smallProject;

public class longJump implements jumpBehavior {

    @Override
    public void jump() {
        System.out.println("Long jump");
    }
    
}
