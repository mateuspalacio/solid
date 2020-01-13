package dip;

import java.util.List;

/**
 *
 * @author mateu
 */
public class Time {

    public void jogar() {
        Quarterback qb = new Quarterback();
        qb.executaFuncaoNoCampo("Odell Beckham Jr.");

        RunningBack rb = new RunningBack();
        rb.executaFuncaoNoCampo("Lamar Jackson");

        TightEnd te = new TightEnd();
        te.executaFuncaoNoCampo("Taysom Hill");
    }

}
