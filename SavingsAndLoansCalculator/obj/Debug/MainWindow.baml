   M S B A M L   `   `   `  ����T  PSavingsAndLoansCalculator, Version=1.0.0.0, Culture=neutral, PublicKeyToken=nullE'clr-namespace:SavingsAndLoansCalculatorSavingsAndLoansCalculator  5   	   *    $SavingsAndLoansCalculator.MainWindow   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   9local'clr-namespace:SavingsAndLoansCalculator     5   	     � Title$"  Savings and Loans Calculator��5   	   $	��462��6.   $	��374��6;   .��5	      � .+�5
   
   �� -   5         ��Name$ savingsGoalLabel��5
      $��Savings Goal:��6*   $
��Left=�6B   $��30��6]   $��	18,25,0,0q�6i   $	��Top=�6|   $	��125��6�    J� RenderTransformOrigin$ 0.48,0.5&�6�   �� 5   
   -   5        $ savedEachMthLabel��5      $��Saved each Month:��6+   $
��Left=�6G   $��30��6b   $��	18,57,0,0q�6n   $	��Top=�6�   $	��170��6�   �� 5   
   -   5        $ annualIntLabel��5      $��Annual Interest Rate:��6(   $
��Left=�6H   $��31��6c   $��	18,89,0,0q�6o   $	��Top=�6�   $	��125��6�   �� 5   
   -   5         ��Name$ saveTBox��5      $
��Left=�6$   $��22��6?   $��
131,29,0,0q�6K    �� TextWrapping$
 Wrap=�6_   $	��Top=�6s   $	��105��6�   �� 5   
   -   5        $ savEachMthTBox��5      $
��Left=�6*   $��20��6E   $��
131,62,0,0q�6Q   $
 Wrap=�6e   $	��Top=�6y   $	��105��6�   �� 5   
   -   5        $ interestTbox��5      $
��Left=�6(   $��20��6C   $��
153,94,0,0q�6O   $
 Wrap=�6c   $	��Top=�6w   $��83��6�   �� 5   
   -   5         ��Name$ 
calcButton��5      $��	Calculate��6%   $
��Left=�69   $��
249,94,0,0q�6T   $	��Top=�6h   $��95��6�   $
��Bold"�6�   6�   �� 5   
   -   5         ��Name$ listBoxOutput��5      $
��Left=�6)   $	��250��6D   $��
17,154,0,0q�6Q   $	��Top=�6e   $	��327��6}   $��Consolas)�6�   �� 5   
   -	   5        $ errorMessBox��5      $�� ��6&   $
��Left=�61   $��29��6L   $��
18,120,0,0q�6X   $	��Top=�6l   $	��273��6�   $��11(�6�   $��Arial Black)�6�   5      5      