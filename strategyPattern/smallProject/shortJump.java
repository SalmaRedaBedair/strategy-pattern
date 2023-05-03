package designPattterns.strategyPattern.smallProject;

public class shortJump implements jumpBehavior {

    @Override
    public void jump() {
        System.out.println("Short jump");
    }
    
}
