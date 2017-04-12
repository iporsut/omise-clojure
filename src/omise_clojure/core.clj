(ns omise-clojure.core)

(require '[clj-http.client :as client])
(require 'cheshire.core)

(defn create-token
  [endpoint pkey params]
  (let [body (cheshire.core/encode params)]
    (client/post endpoint
                 {
                  :as :json
                  :basic-auth [pkey ""]
                  :content-type :json
                  :body body})))
