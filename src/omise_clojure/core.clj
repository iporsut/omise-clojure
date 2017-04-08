(ns omise-clojure.core)

(require '[clj-http.client :as client])

(defn create-token
  [endpoint pkey params]
  (client/post endpoint
               {
                :as :json
                :basic-auth [pkey ""]
                :form-params params}))
