package Salazar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Util {

    private static InputStreamReader isr = new InputStreamReader(System.in);
    private static BufferedReader br = new BufferedReader(isr);

    public static String leerStr(String mensaje) throws IOException {
        imprimir(mensaje); //Mensaje
        String r = br.readLine(); //Lectura
        return r;
    }

    public static int leerInt(String mensaje) {
        int resultado = 0;

        while (true) {
            try {
                imprimir(mensaje);// Mensaje
                String str = br.readLine(); // Lectura
                resultado = Integer.parseInt(str); // Conversión
                break; //Rompe el bucle infinito 
            } catch (Exception e) {
                imprimir("ERROR:" + e.toString() + "\n");
            }

        }
        return resultado;
    }

    public static float leerFloat(String mensaje) {
        float resultado = 0f;
        while (true) {
            try {
                imprimir(mensaje);
                String str = br.readLine();
                resultado = Float.parseFloat(str);
                break;
            } catch (Exception e) {
                imprimir("ERROR:" + e.toString() + "\n");
            }

        }
        return resultado;
    }

    public static float leerFloat(String mensaje, float inf) {
        float resultado = 0f;
        while (true) {
            try {
                imprimir(mensaje);
                String str = br.readLine();
                resultado = Float.parseFloat(str);
                if (resultado >= inf) {
                    break;
                } else {
                    imprimir("\n Valor no Permitido\n");
                }
            } catch (Exception e) {
                imprimir("ERROR:" + e.toString() + "\n");
            }

        }
        return resultado;
    }

    public static float leerFloat(String mensaje, float inf, float sup) {
        float resultado = 0f;
        while (true) {
            try {
                imprimir(mensaje);
                String str = br.readLine();
                resultado = Float.parseFloat(str);
                if (resultado <= sup && resultado >= inf) {
                    break;
                } else {
                    imprimir("\nValor fuera del rango\n");
                }

            } catch (Exception e) {
                imprimir("ERROR:" + e.toString() + "\n");
            }

        }
        return resultado;
    }

    public static int leerInt(String mensaje, int inf, int sup) {
        int resultado = 0;
        while (true) {
            try {
                imprimir(mensaje);
                String str = br.readLine();
                resultado = Integer.parseInt(str);
                if (resultado <= sup && resultado >= inf) {
                    break;
                } else {
                    imprimir("\nValor fuera del rango\n");
                }

            } catch (Exception e) {
                imprimir("ERROR:" + e.toString() + "\n");
            }

        }
        return resultado;
    }

    public static byte leerByte(String mensaje, byte inf, byte sup) {
        byte resultado = 0;
        while (true) {
            try {
                imprimir(mensaje);
                String str = br.readLine();
                resultado = Byte.parseByte(str);
                if (resultado <= sup && resultado >= inf) {
                    break;
                } else {
                    imprimir("\nValor fuera del rango\n");
                }

            } catch (Exception e) {
                imprimir("ERROR:" + e.toString() + "\n");
            }

        }
        return resultado;
    }

    public static byte leerByte(String mensaje) {
        byte resultado = 0;
        while (true) {
            try {
                imprimir(mensaje);
                String str = br.readLine();
                resultado = Byte.parseByte(str);
                break;
            } catch (Exception e) {
                imprimir("ERROR:" + e.toString() + "\n");
            }

        }
        return resultado;
    }

    public static short leerShort(String mensaje) {
        short resultado = 0;
        while (true) {
            try {
                imprimir(mensaje);
                String str = br.readLine();
                resultado = Short.parseShort(str);
                break;
            } catch (Exception e) {
                imprimir("ERROR:" + e.toString() + "\n");
            }

        }
        return resultado;
    }

    public static short leerShort(String mensaje, short inf, short sup) {
        short resultado = 0;
        while (true) {
            try {
                imprimir(mensaje);
                String str = br.readLine();
                resultado = Short.parseShort(str);
                if (resultado <= sup && resultado >= inf) {
                    break;
                } else {
                    imprimir("\nValor fuera del rango\n");
                }

            } catch (Exception e) {
                imprimir("ERROR:" + e.toString() + "\n");
            }

        }
        return resultado;
    }

    public static long leerLong(String mensaje) {
        long resultado = 0;
        while (true) {
            try {
                imprimir(mensaje);
                String str = br.readLine();
                resultado = Long.parseLong(str);
                break;
            } catch (Exception e) {
                imprimir("ERROR:" + e.toString() + "\n");
            }

        }
        return resultado;
    }

    public static long leerLong(String mensaje, long inf, long sup) {
        long resultado = 0;
        while (true) {
            try {
                imprimir(mensaje);
                String str = br.readLine();
                resultado = Long.parseLong(str);
                if (resultado <= sup && resultado >= inf) {
                    break;
                } else {
                    imprimir("\nValor fuera del rango\n");
                }

            } catch (Exception e) {
                imprimir("ERROR:" + e.toString() + "\n");
            }

        }
        return resultado;
    }

    public static double leerDouble(String mensaje) {
        double resultado = 0;
        while (true) {
            try {
                imprimir(mensaje);
                String str = br.readLine();
                resultado = Double.parseDouble(str);
                break;
            } catch (Exception e) {
                imprimir("ERROR:" + e.toString() + "\n");
            }

        }
        return resultado;
    }

    public static double leerDouble(String mensaje, double inf, double sup) {
        double resultado = 0;
        while (true) {
            try {
                imprimir(mensaje);
                String str = br.readLine();
                resultado = Double.parseDouble(str);
                if (resultado <= sup && resultado >= inf) {
                    break;
                } else {
                    imprimir("\nValor fuera del rango\n");
                }

            } catch (Exception e) {
                imprimir("ERROR:" + e.toString() + "\n");
            }

        }
        return resultado;
    }

    public static Calendar leerCalendar(String mensaje) {
        Calendar resultado = Calendar.getInstance();
        while (true) {
            try {
                imprimir(mensaje);
                String str = br.readLine();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date date = sdf.parse(str);
                resultado.setTime(date);
                break;

            } catch (Exception e) {
                imprimir("ERROR:" + e.toString() + "\n");
            }

        }
        return resultado;

    }

    public static Calendar leerCalendar(String mensaje, String formato) {
        Calendar resultado = Calendar.getInstance();
        while (true) {
            try {
                imprimir(mensaje);
                String str = br.readLine();
                SimpleDateFormat sdf = new SimpleDateFormat(formato);
                Date date = sdf.parse(str);
                resultado.setTime(date);
                break;

            } catch (Exception e) {
                imprimir("ERROR:" + e.toString() + "\n");
            }

        }
        return resultado;

    }

    public static int CalcularAnios(Calendar fecha) {
        Calendar hoy = Calendar.getInstance();
        int anios = hoy.get(Calendar.YEAR) - fecha.get(Calendar.YEAR);
        int meses = hoy.get(Calendar.MONTH) - fecha.get(Calendar.MONTH);
        int dias = hoy.get(Calendar.DAY_OF_MONTH) - fecha.get(Calendar.DAY_OF_MONTH);
        if (meses < 0 || (dias < 0 && meses == 0)) {
            anios--;
        }
        return anios;
    }

    public static int CalcularAnios(Calendar inicio, Calendar fin) {

        int anios = fin.get(Calendar.YEAR) - inicio.get(Calendar.YEAR);
        int meses = fin.get(Calendar.MONTH) - inicio.get(Calendar.MONTH);
        int dias = fin.get(Calendar.DAY_OF_MONTH) - inicio.get(Calendar.DAY_OF_MONTH);
        if (meses < 0 || (dias < 0 && meses == 0)) {
            anios--;
        }
        return anios;
    }

    public static void imprimirFecha(String mensaje, Calendar fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String strFecha = sdf.format(fecha.getTime());
        imprimir(mensaje);
        imprimir(strFecha);

    }
     public static String mostrarFecha(Calendar fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
       return sdf.format(fecha.getTime());    
    }

    public static Calendar cambiarstringACalendar(String fecha) {
        Calendar resultado = Calendar.getInstance();
        try {

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date date = sdf.parse(fecha);
            resultado.setTime(date);

        } catch (Exception e) {
            imprimir("ERROR:" + e.toString() + "\n");
        }
        return resultado;

    }

    public static Object leerEnum(String titulo, String mensaje, Object[] enums) {
        imprimir(titulo);
        int i = 1;
        for (Object opcion : enums) {
            imprimir(i + " " + opcion.toString() + "\n");
            i++;
        }
        byte posicion = leerByte(mensaje, (byte) 1, (byte) enums.length);
        return enums[posicion - 1];
    }
   
    public static boolean leerBool(String mensaje) throws IOException {
        imprimir(mensaje);
        String str = br.readLine();
        return str.equals("s") || str.equals("S");
    }

    public static void imprimir(String mensaje) {
        System.out.print(mensaje);
    }
}
