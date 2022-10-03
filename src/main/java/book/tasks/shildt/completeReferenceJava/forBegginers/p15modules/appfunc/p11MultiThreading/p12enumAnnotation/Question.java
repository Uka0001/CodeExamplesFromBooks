package book.tasks.shildt.completeReferenceJava.forBegginers.p15modules.appfunc.p11MultiThreading.p12enumAnnotation;

import java.util.Random;

public class Question {
    Random random = new Random();
    Answers ask(){
        double prob = 100 * random.nextDouble();
        if (prob < 15) return Answers.MAYBE;
        else if (prob < 30) return Answers.NO;
        else if (prob < 60) return Answers.YES;
        else if (prob < 75) return Answers.LATER;
        else if (prob < 98) return Answers.SOON;
        else return Answers.NEVER;
    }
}
