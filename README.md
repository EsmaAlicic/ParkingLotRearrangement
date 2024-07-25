# Parking Lot Solver

Java program za optimizaciju rasporeda automobila na parkingu s jednim slobodnim mjestom. Koristi BFS algoritam za pronalaženje minimalnog broja koraka potrebnih da se postigne ciljani raspored.

## Opis

Ovaj program prima početno i završno stanje parkinga te koristi algoritam pretraživanja u širinu (BFS) za pronalaženje najkraćeg puta (minimalnog broja koraka) između ova dva stanja. Program ispisuje svaki korak potreban za postizanje ciljanog rasporeda.

## Kako koristiti

1. **Klonirajte repozitorij:**

   ```
   git clone 
   ```

2. **Pokrenite program:**

   Učitajte početno stanje parkinga i ciljano stanje:
     - Unesite brojeve razdvojene razmakom za početno stanje parkinga.
     - Unesite brojeve razdvojene razmakom za ciljano stanje parkinga.

3. **Pregledajte rezultate:**

   Program će ispisati početno stanje, broj koraka i svako stanje parkinga kroz koje je prošao.

## Primjer Unosa i Izlaza

**Unos:**

```
Enter the initial state of the parking (numbers separated by space):
2 0 1 3
Enter the target state of the parking (numbers separated by space):
3 1 0 2
```

**Izlaz:**

```
Initial state: 2 0 1 3
Number of steps: 4
Step 1: 2 1 0 3
Step 2: 0 2 1 3
Step 3: 2 0 1 3
Step 4: 3 1 0 2
```

## Tehnologije

- **Java**
- **BFS Algoritam**
