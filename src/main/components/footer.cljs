(ns components.footer)


(defn footer [completed-todos-count total-todos-count]
  [:div.footer
     [:span.footer-item "Completed Todos: " completed-todos-count]
     [:span.footer-item "Total Todos: " total-todos-count]
   ]
  )