(ns paradigma.core
  (:gen-class)
  (:import java.time.LocalDate)
  (:import java.time.temporal.ChronoUnit))

(defn pega-nome [] 
  (println "Digite o nome de uma pessoa:") 
  (read-line))
(defn pega-nascimento []
  (println "Digite a data de nascimento no formato ddMMaaaa") 
  (read-line))

(defn converte-data [dia]
  (let [agora (LocalDate/now)
        nascimento (LocalDate/of (read-string (subs dia 4)) (read-string (subs dia 2 4)) (read-string (subs dia 0 2))) ]
    (.between (ChronoUnit/YEARS) nascimento agora)))

(defn -main
  [& args]
  (let [nome (pega-nome)
        dia  (pega-nascimento)]
    (println (str " voce digitou " nome " e " dia))
    (println (str nome " tem " (converte-data dia) " anos") )
    ))

