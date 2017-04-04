(ns paradigma.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (let [nome (do 
               (println "Digite o nome de uma pessoa:") 
               (read-line))
        data (do 
               (println "Digite a data de nascimento no formato ddMMaaaa") 
               (read-line)) ]
    (println (str " voce digitou " nome " e " data))))

