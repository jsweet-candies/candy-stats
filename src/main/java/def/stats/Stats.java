package def.stats;
import def.dom.HTMLDivElement;
public class Stats extends def.js.Object {
    public double REVISION;
    public HTMLDivElement domElement;
    native public void setMode(double value);
    native public void begin();
    native public double end();
    native public void update();
}

