package com.ecommerce.models

case class Merchant(
                     merchant_id: String,
                     name: String,
                     category: String,
                     region: String,
                     commission_rate: String,
                     establishment_date: String
                   )
