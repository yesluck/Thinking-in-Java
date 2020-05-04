package access;

import access.protectedtst.ProtectedClass;

public class Practice4_outside {
    public static void main(String[] args) {
        ProtectedClass pc = new ProtectedClass();
        // {CompileTimeError} (Won't compile)
//        pc.echo();
    }
}
