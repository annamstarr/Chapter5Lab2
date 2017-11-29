
/**
 * Write a description of class Probability here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Probability implements ProbabilityCalc
{
    // instance variables - replace the example below with your own
    private double prob;
    private int favorable;
    private int sampleSpace;
    
    public Probability(int fav, int sample) {
        this.favorable = fav;
        this.sampleSpace = sample;
        prob = ((double)favorable)/sampleSpace;
    }
    public double probabilityAND(Probability p2) {
         return this.prob = (this.p1 * p2);
    }
    public double probabilityOR(Probability p2) {
        return this.prob = (this.p1 + p2) - this.overlap;
    }
    public double setOverlap() {
        this.overlap = this.outcomeAND; 
    }
}
