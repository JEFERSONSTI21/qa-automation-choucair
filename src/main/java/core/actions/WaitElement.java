package core.actions;

import core.Helpers.GeneralParams;
import core.Helpers.ICommand;
import core.Helpers.IParam;
import core.user_interface.TargetComponent;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class WaitElement implements ICommand<Task> {

    private ICommand<Target> _target;

    public WaitElement() {
        _target = new TargetComponent();
    }

    @Override
    public Task Execute(IParam params) {

        GeneralParams param = (GeneralParams)params;
        return Task.where(param.where, WaitUntil.the(_target.Execute(params),isPresent()));
    }
}
