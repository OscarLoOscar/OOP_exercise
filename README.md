# OOP Exercise Guide

This document provides instructions for completing four exercises related to Object-Oriented Programming (OOP). Each exercise is designed to help you implement and understand various OOP concepts such as classes, interfaces, enums, and inheritance.

## Exercise 1: Product and Categories

### Objective

Create classes to represent different product categories and implement discount logic.

### Tasks

1. **Understand the Files:**
   - **Abstract Class:**
     - `Product.java`: 
       - **Attributes:** `name` (String), `price` (double), `productCategory` (ProductCategory)
       - **Methods:** Abstract methods for subclasses to implement
   - **Classes:**
     - `Clothing.java`, `Electronics.java`, `Food.java`: 
       - Extend `Product`
       - **Attributes:** Add category-specific fields if needed
   - **Enum:**
     - `ProductCategory.java`: Defines categories like `CLOTHING`, `ELECTRONICS`, `FOOD`
   - **Enum:**
     - `DiscountCode.java`: Defines codes like `DISCOUNT10`, `FOOD20`

2. **Implement Discount Logic:**
   - Add methods to apply discounts using `DiscountCode`.

3. **Explore Inheritance:**
   - Implement and test category-specific logic in each subclass.

==Dont forget Override equals() , hashcode() , toString()==

## Exercise 2: Customer Management

### Objective

Create and manage customer entities with membership types.

### Tasks

1. **Understand the Files:**
   - **Class:**
     - `Customer.java`: 
       - **Attributes:** `name` (String), `memberType` (MemberType)
       - **Methods:** Getters, setters, and constructor
   - **Enum:**
     - `MemberType.java`: Defines membership types `REGULAR`, `SILVER`, `GOLD`
       - **Methods:** `upgrade()`, `downgrade()`

2. **Implement Membership Logic:**
   - Use `MemberType` methods to handle customer membership changes.

3. **Enhance Customer Class:**
   - Add additional methods if necessary for managing customers.

## Exercise 3: Inventory and Shopping Cart

### Objective

Create an inventory system and manage a shopping cart for products.

### Tasks

1. **Understand the Files:**
   - **Interface:**
     - `Inventory.java`: 
       - **Methods:** `addProduct(T product, int quantity)`, `removeProduct(T product, int quantity)`, `getProductStock(T product)`, `totalPrice()`
   - **Class:**
     - `ShoppingCart.java`: Implements `Inventory`
       - **Attributes:** `items` (HashMap<T, Integer>)
       - **Methods:** Implement inventory operations

2. **Shopping Cart Operations:**
   - Implement methods to manage products in the cart.

3. **Test Inventory Management:**
   - Create test cases to validate inventory operations.

## Exercise 4: Order and Customer Manager

### Objective

Manage customer orders and update membership status based on purchase history.

### Tasks

1. **Understand the Files:**
   - **Class:**
     - `Order.java`: 
       - **Attributes:** `orderId` (int), `customer` (Customer), `orderDate` (LocalDateTime), `items` (ShoppingCart<Product>), `finalAmount` (double)
       - **Methods:** `applyDiscounts(DiscountCode)`
   - **Class:**
     - `CustomerManager.java`: 
       - **Methods:** `updateMemberType(Customer, List<Order>)`, `calculateTotalOrderSize(List<Order>)`

2. **Order Handling:**
   - Implement logic to apply discounts to orders.

3. **Customer Manager Logic:**
   - Use `CustomerManager` to adjust membership based on order totals.

4. **Compare Orders:**
   - Implement `compareTo` in `Order` to compare by `MemberType`.

[Link text here](https://viewer.diagrams.net/?tags=%7B%7D&lightbox=1&highlight=0000ff&edit=_blank&layers=1&nav=1#R%3Cmxfile%3E%3Cdiagram%20name%3D%22%E7%AC%AC%201%20%E9%A1%B5%22%20id%3D%22uv1Uj6VXP3o-lOHNqz6c%22%3E7V3vc6I6F%2F5rnNn7YR0SIMDHrbbdzthtZ%2B2%2B974fqaTKXSRejG29f%2F1NhIiYgLYlSmey09lKCBTO85zknMf86NmD%2Bet1Fi5mtyTCSQ9a0WvPHvYgBMj32C9ess5LIAB2XjLN4qioVRaM439xUWgVpas4wstKRUpIQuNFtXBC0hRPaKUszDLyUq32RJLqX12EUywVjCdhIpf%2BGUd0lpf60CvLv%2BN4OhN%2FGaAgPzMPReXiTZazMCIvO0X2Zc8eZITQ%2FNP8dYATbj1hl%2Fy6q5qz2wfLcEqPuWD0e0YAvfajP%2F2rx3n6Lbmf%2F%2F3VK27zHCar4o2Lp6VrYYKMrNII87tYPfviZRZTPF6EE372haHOymZ0nrAjwD4Wt8MZxa%2B1Dwq2r8%2BIg8kc02zNqogLhMUKznwVXHgpAQCOXxTOdq1veUVpWMA%2B3d69tAz7UBjnDYZS2QkldPPG%2Be%2FwcUmzkFEQomlRLn73oA247e4zEq14jT0LL1%2FieRKm7OjiiaR0XJzh9gyTeJqyzxNmPJyxAm7amPHzW3GCEo7AZBYn0ShckxU3xZKGk9%2Fi6GJGsvhfdttQYMROZ7RwNQf0g8BC0AmKf07lijG%2FU4F8hpfsmnuBI9grug1fKxVH4ZIWBROSJOFiGT9uXouXzMNsGqcXhFIyL4paYE7geBXmeMiXmAPdQEEcO8jN4GqiD5ToM6ZZnE5ZWRrOscQIZgO6QSojv%2FGAJIRBP0xJTpE4SfaKBEsS%2FERrObJkTsv%2B5GhTZ%2BiUJT8LQ%2FAiwq59Sjbt1CyOIpxyPAkNaViCtyBxSjcWci%2FYD3O5gdV3ey578AE7BuUx%2B%2BHVMzogKfeOeIMjZsx4wUt6LOj1DikzoUBeQeujiAB9TQSwJQJEZMVNyl41iyeGAW0zAFU9%2BmzAOxLwRS8wCCmeks0jL%2FZLDBda5ULgdYMLroRsEm8Qy5EVASZ4F6xzBlCCSxwfOMzDr0DC2paxthW4JuEjTu7JMqYx4ffP8rp7eB%2BCtMrZOJ3hLNYJNYDum7AGjiaskeT3g4TQ2abP7074B52%2BF7Aszf3EUZ%2Fvo0rUFyAkYe95MvQ2Eu%2BuhwGe8faPeztq9PaSvscADqAmpH3J1y8TPGG2SOPJ0rh7u%2B4OLIFjg78H%2Fun9PTD%2B%2FnF%2F99%2Fp7yrAtfm7EKR2HP6KkMh4esueDlBVCVR5ugtP7%2BkAGFdvIZC31Ogf9HUV5Np8XSjKO1jjaIqFLzOLzciUpGFyWZZeVCXzss6IbLDkUP6NKV0XzhquKOlVZHT8GtO%2Fisv55%2F%2Fzz33oFofD151zw7U4SNkL%2FyXuwA%2Fyy1xxWF62ORLX5S%2FI36rZUZkRyCqb4CZMCxhYSzTFTeBDNfYZTkIaP1cfpH3%2FleXYfTUfp6v5YSW%2FVrExin5LXYBtVbsAz1N9GaT6Lki3pA9kSXcwunv4fvPjWqKDEfAOdgY1DcLxer6SBdqkPCDrupejy8HDz7sfN4OxIUDbBKiX80%2BMuyuH%2Fnd3QwN424DXa%2FYnBhyZWL%2BFWL8Z7AbVXt2561LtgffRyHAYLycs%2Bme2jeQvdc8YFrJwCHnItgPoux5w2P%2BfOCx0UFUCdC1ZGABAJQH7cM8Muogka8LDm%2FHg7tePByBnlKa3ONiAeI0NiILdR%2FEBIl34B7X4Q4N%2F6%2FgjV%2BnWZ4MfKhRiFiYa6NuHPgAdg14eKnr%2F8274a2Aafg3oM2w7Br%2BsLQpZSB7%2BY%2BD%2FKPyO3TH4bZMutpAuHkAd7Yd7R0b%2Fti7UZTVwsFqylIdlch3KAaHXt3zLLiJk%2Fv8nzgERDCo5IFJME4EiL9xlQeDuWUEXKWSp0Az6%2F1i7kPtZ%2FVfGMr%2BPYoSYzdU%2BBeRRoLd4%2Foizh%2FWCD%2F2f7xwYMrRLBtdRuvn5uGDGg7YQGRwA3QfvAl1fHyDLgG%2FUk2%2Frm4hzDjKAfQ%2F6NnJt30HAtYNPHEhs5xqLXkQRRwDVlxCBVTGCNg7JUuLPy%2Btfo28%2FTafx9vajeYCpzOujqKBv2qCsI45vRv%2B7NNC3Dr1ndQx6WUe8vhsNDfBtAx%2F4HQMemkCxhUCxGXQA0btQ1wa6PJqwByvBn7VaTLMwwl%2F%2BME1A62ywHVUod74mQNYT99kQkZfU8EEXHxDsFh9kKXE%2FjYx5ovfEl%2BWpzyVv0mdmlq6NV7f6yNkM%2Ffq8KSQAQkHYKpEyZWzHUSSRLhKvr4k6ZvxiC9FE7oD1aaNVAfEQ6NqaCdXoxYtnwi5ify2KilkrXx562zVHeKPL7speHlr%2FrMKUxnRtOpT2CeK%2FiSDaRGhbpUcKhmR4zuxtSHIuknhuR0giC46MJDn8U0wLgowpmfzeZYlhROuMABbsBiUcWYdklNguYUaZbZN7vo6ZyUY0sAAGHWGBLEmOZ2SxYHYfsIC%2BS1kFHwoQ2J96%2BYPAcis5hQvkYU7qnMKzipfXRAMo0eB7uJzdhguRjD7kEcMNw3bKh0CJTNSKKZ7LK%2BKYFuJQC%2BE0r3q2ZfuZ2wcz%2BLGFXPMA1nxcy%2FFYa1vWUqlQmlTz%2FG0Bgt1oC1SSpck0u8ERP%2BgGR%2BThkSbRPAshAEDdYIRSwTR55mlI4NjdIIEsUt5lUcemUqC%2B41p%2BOd%2FY%2F8SZJhLbgIh0AtkyBQJbkWkGVtUMuqZVObIkydBggG6jBcIZchOZVuHtrcKBNTdlph%2FFDW1T7FxZiywnW1mTunlXhggfJIILlb5%2BPh7IauSIMIiGIcUPMZ9flTcK%2FNiwoW02eH7H2CCLklVtOlcmt1swGUlSLz%2BA5XSMIA1b8DzFKQNrztdtMkxonQm2Okg8HxMcCWQjU7eOuovehbq2vXeUeuS2BQgXi2Qt1m5bfqmu4mZFO4dGeGifK6hrfYVi954ir7gN03DaMS3C73%2Fuhf4dsajzdt9GCX8XKfBHbl%2FfIv%2Buma%2FdQi%2FhHtjAx%2B8rV%2FhXoa2tZ2gaE7laRCx9LGdefFFKDfxLq1G83GYZhVy5zTFEzU350vQgrfPIRsfzSMynbp9IqnGTe0hPVtnzZmOIbSP%2Bje9SzQoeE8Kb7ErLDpAouIr5sxSbN0TimoIP290i%2BhbqlRtGbLeByM85QW93W4je%2FjYV%2BbO2sw1EXu%2FgLhA1oB69C8TmUmaMcL1ToeBreed7kkvEYlyVWK1JzP8shrWV0Od3LImwfbT3cwOpBlCelhtOAzfczlGjJmLUSw1gIXAGbshC5qm54cPPxI26nYM0kwPsbzR5EnLIuuaEh%2FhxKouW9SQRgJcUIItNZ89KBGdghRFuFwjhHM0IvYSohAVtgKqa7d0EZhQuZxrdvwHswD4Z2mKW60G068YxaPZ%2FuOf%2Fjn8K%2F1cNtNTo901RgueczvP9I7lQtyCYXi744vlOSgWVhKmzCwjqqQC87lHhPM1CsDf1%2BzRUUI2c1EeFHR6wWBGdLRw4lgl16wfrZYILwRmYoBoxqbN%2FsHcbhb611y6cLloQGn1HewhkV4MFWEy9vjqy%2FmnIo5I%2BdfYoXiN5TteSHE2eum%2BuNIcXyG8iz1vJwA4zQuhu9SxczG5JhHmN%2FwA%3D%3C%2Fdiagram%3E%3C%2Fmxfile%3E)# OOP_exercise
