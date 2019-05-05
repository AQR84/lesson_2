package MyExceptions;

public class MyArray {

    public void ForArrayWork(String[][] _myarr) throws MyArrayException{

        if (_myarr.length!=4){
             throw  new MyArraySizeException("Можно передавать только массив 4*4");
        }else if (_myarr[0].length!=4){
             throw new MyArraySizeException("Можно передавать только массив 4*4");
        }

        for (int i = 0; i < _myarr.length; i++) {
            for (int j = 0; j < _myarr[i].length; j++) {
                try {
                    Integer.parseInt(_myarr[i][j]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException("Ошибка преобразования в число, строка: "+(i+1)+", колонка:"+(j+1));
                }


            }
        }

    }
}
