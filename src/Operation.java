public enum Operation {
    ADD("+"),
    MINUS("-"),
    DIV("/"),
    MULTI("*");


    Operation(String operation) {
    this.operation = operation;
    }

    public String operation;

    public int calc(Calculator calculator) {
       int res = 0;
        switch (this) {
    case ADD: res = calculator.add(); break;
    case MINUS:res = calculator.subs(); break;
    case DIV: res = calculator.div(); break;
    case MULTI: res = calculator.multi(); break;
    default: break;

}

    return res;

   }
}