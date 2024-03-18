(ns components.todoitem)

(defn- handle-delete [item items]
   (.info js/console "item: " (:name item) " deleted")
  
    (reset! items (filter #(not= item %1)  @items))
  )

(defn- handle-click [item items]
  (let
       [
         name  (:name item)
         new-array  (reset! items (map (fn [todo]
               (if (= name (:name todo))  
                 (assoc todo :done (not (:done todo)))
                 todo
                 )
            )
          @items)
             )
        
        ]
    (.info js/console "item clicked: " name)

      (.info js/console "modified array: " new-array)

    )
  

  

  )


(defn todoitem [item items]
   [:div.item
      [:div.itemName 
       [:span {
               :class (when (:done item) "completed")
               :on-click (fn [_]
                           (handle-click item items)
                           )
               } 
          (:name item)
        ]
       [:span 
         [:button.deleteButton {:on-click (fn [_] 
                                            (handle-delete item items)
                                            )}
          "X"
          ]
        ]
       ]
      [:hr.line]
   ]
    
  )