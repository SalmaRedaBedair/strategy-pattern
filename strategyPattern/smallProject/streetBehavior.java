package designPattterns.strategyPattern.smallProject;

public class streetBehavior {
    public static void main(String args[])
    {
        jumpBehavior longjump=new longJump();
        kickBehavior lightingKick=new lightingKick();
        kickBehavior tornadKick=new tornadKick();

        fighter ken=new Ken(tornadKick, longjump);

        ken.display();
        ken.punch();
        ken.jump();
        ken.kick();

        ken.SetKickBehavior(lightingKick);
        ken.kick();
    }
}
