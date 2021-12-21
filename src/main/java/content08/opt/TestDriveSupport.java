package content08.opt;

import java.util.Optional;

public class TestDriveSupport {

    public static void main(String[] args) {

        Optional<String> user = Optional.of("Furkan");
        Optional<String> user2 = Optional.empty();

        if (user.isPresent()) {
            System.out.println("Değer bulunmakta");
        } else {
            System.out.println("Değer bulunamıyor.");
        }

        user.ifPresent(g -> System.out.println("Kullanıcı Adı Var."));
        user2.ifPresent(g -> System.out.println("Kullanıcı Adı Var."));


    }

}
