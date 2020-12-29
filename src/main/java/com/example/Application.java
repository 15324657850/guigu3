package com.example;

/**
 * @author wxl
 */
public class Application {

    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        simulator.playExpert(new ComputerStudent());
        simulator.playExpert(new MusicStudent());
    }
}
