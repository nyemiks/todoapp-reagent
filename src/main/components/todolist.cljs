(ns components.todolist
  (:require
  ; [reagent.core :refer [atom]]
            [components.todoitem :refer [todoitem]]
            )
  )








(defn todolist [items]
  [:div.list 
   (map (fn [item]
        ;  [:h3 {:key item} item]
         ^{:key (:name item)} [todoitem item items]
          ) 
        @items
        )
   ]   
  )