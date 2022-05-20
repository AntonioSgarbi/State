package tech.antoniosgarbi.main;

import tech.antoniosgarbi.Context;
import tech.antoniosgarbi.StartState;
import tech.antoniosgarbi.State;
import tech.antoniosgarbi.StopState;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        State startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        State stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
