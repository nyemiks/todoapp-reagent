(ns components.todo
  (:require [reagent.core :refer [atom]]
            [components.form :refer [form]]
            [components.todolist :refer [todolist]]
            [components.footer :refer [footer]]
            )
  )


(def items (atom []))

(defn- completed-count []
   (count (filter (fn [item]
             (when (:done item) item)
             )  @items))
  )

(defn todo []
  [:div 
      [form items]
      [todolist items]
      [footer (completed-count) (count @items)]
   ]
  )