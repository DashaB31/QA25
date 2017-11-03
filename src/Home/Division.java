package Home;

public class Division {


        public int calculate ( int a, int b)
        {

                //if это условие в данном случае на то что параметр n < 0
                if (a == 0) {
                    throw new RuntimeException("\n" +
                            "You can not divide by 0"); //выбрасывает исключение (ошибку) и останавливает выполнение программы
                }
                int result = a / b;
                return result;
            }

        }

