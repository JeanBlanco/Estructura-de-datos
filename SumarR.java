public class SumarR {
    public static void main(String[] args) {
        System.out.println(s(10));
    }
    public static int s(int n){
        if (n == 1) {
            return 1;
            
        }else{
            return s(n-1) + n;
        }
    }
}

/*
 * Este código en Java calcula la **suma de los primeros n números enteros** usando **recursividad**.
Vamos línea por línea:

---

### **Clase y método principal**

```java
public class SumaR {
    public static void main (String[] argv) {
        System.out.println(s(10));
    }
```

* Se define la clase `SumaR`.
* En el método `main` (punto de entrada del programa) se llama a `s(10)` y el resultado se imprime en consola.
* `s(10)` significa: "Calcula la suma de los números del 1 al 10".

---

### **Método recursivo `s`**

```java
public static int s(int n) {
    if (n == 1) {
        return 1;
    } else {
        return s(n-1) + n;
    }
}
```

* **Parámetro:** `n` es el número hasta donde se quiere sumar.

* **Caso base:**

  ```java
  if (n == 1) {
      return 1;
  }
  ```

  Aquí se detiene la recursión. Si `n` es 1, simplemente devuelve 1 (la suma de solo el número 1 es 1).

* **Llamada recursiva:**

  ```java
  return s(n-1) + n;
  ```

  Esto significa: "La suma hasta n es la suma hasta n-1, más n".
  Por ejemplo:

  * `s(3) = s(2) + 3`
  * `s(2) = s(1) + 2`
  * `s(1) = 1` (caso base)

---

### **Ejemplo con `s(10)`**

La ejecución sería:

1. `s(10) = s(9) + 10`
2. `s(9) = s(8) + 9`
3. ...
4. `s(2) = s(1) + 2`
5. `s(1) = 1`

Al reemplazar hacia arriba:

```
s(1) = 1
s(2) = 1 + 2 = 3
s(3) = 3 + 3 = 6
s(4) = 6 + 4 = 10
...
s(10) = 45 + 10 = 55
```

---

**En resumen**:
Este código usa recursividad para calcular:

$$
s(n) = 1 + 2 + 3 + ... + n
$$

Con `n = 10`, imprime **55**.

---

 */