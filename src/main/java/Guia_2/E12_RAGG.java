/*
Construya un programa que muestre lo siguiente por pantalla:
i. ZYWXVUTSRQPONMLKJIHGFEDCBA
ii. YWXVUTSRQPONMLKJIHGFEDCBA
iii. WXVUTSRQPONMLKJIHGFEDCBA
iv. XVUTSRQPONMLKJIHGFEDCBA
v. VUTSRQPONMLKJIHGFEDCBA
vi. UTSRQPONMLKJIHGFEDCBA
vii. TSRQPONMLKJIHGFEDCBA
viii. SRQPONMLKJIHGFEDCBA
ix. RQPONMLKJIHGFEDCBA
x. QPONMLKJIHGFEDCBA
xi. PONMLKJIHGFEDCBA
xii. ONMLKJIHGFEDCBA
xiii. NMLKJIHGFEDCBA
xiv. MLKJIHGFEDCBA
xv. LKJIHGFEDCBA
xvi. KJIHGFEDCBA
xvii. JIHGFEDCBA
xviii. IHGFEDCBA
xix. HGFEDCBA
xx. GFEDCBA
xxi. FEDCBA
xxii. EDCBA
xxiii. DCBA
xxiv. CBA
xxv. BA
xxvi. A
 */
package Grupo_Numero_3;

public class E12_RAGG {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for (char x = 'Z'; x >= 'A'; x--) {
            for (char y = x; y >= 'a'; y--) {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}
