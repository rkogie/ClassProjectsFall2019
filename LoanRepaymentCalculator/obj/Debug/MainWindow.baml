   M S B A M L   `   `   `  ����R  NLoanRepaymentCalculator, Version=1.0.0.0, Culture=neutral, PublicKeyToken=nullA%clr-namespace:LoanRepaymentCalculatorLoanRepaymentCalculator  5   	   (    "LoanRepaymentCalculator.MainWindow   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   7local%clr-namespace:LoanRepaymentCalculator     5   	   -   5          �Name$  Loan_Repayment_Calculator��5   	    � Title$ Loan Repayment Calcuator��5   	   $	��528��6*   $	��364��67   .��5	      � $��0,1,0,-1q�6   .+�5
   
   �� -   5         ��Name$ loanPrincipalLabek��5
      $��Loan Principal��6,   $
��Left=�6E   $��25��6`   $��	21,16,0,0q�6l   $	��Top=�6   $	��120��6�   �� 5   
   -   5        $ monPayLabel��5      $��Monthly Payments��6%   $
��Left=�6@   $��	21,48,0,0q�6[   $	��Top=�6n   $	��120��6�   �� 5   
   -   5        $ interestLabel��5      $��Annual Interest Rate��6'   $
��Left=�6F   $��30��6a   $��	21,79,0,0q�6m   $	��Top=�6�   $	��120��6�   �� 5   
   -   5        $ numMonthLabel��5      $��Number of Months��6'   $
��Left=�6B   $��29��6]   $��
21,113,0,0q�6i   $	��Top=�6}   $	��115��6�   �� 5   
   -   5         ��Name$ loanPrincTBox��5      $
��Left=�6)   $��25��6D   $��
145,16,0,0q�6P    �� TextWrapping$
 Wrap=�6d   $	��Top=�6x   $	��120��6�   �� 5   
   -   5        $ monthlyPayTBox��5      $
��Left=�6*   $��25��6E   $��
145,49,0,0q�6Q   $
 Wrap=�6e   $	��Top=�6y   $	��120��6�   �� 5   
   -   5        $ interestTBox��5      $
��Left=�6(   $��25��6C   $��
145,82,0,0q�6O   $
 Wrap=�6c   $	��Top=�6w   $��60��6�   �� 5   
   -	   5        $ numMonthTBox��5      $
��Left=�6(   $��27��6C   $��145,115,0,0q�6O   $
 Wrap=�6d   $	��Top=�6x   $��60��6�   �� 5   
   -
   5         ��Name$ 
caclButton��5      $��	Calculate��6%   $
��Left=�69   $��27��6T   $��215,115,0,0q�6`   $	��Top=�6u   $	��115��6�   $��Arial)�6�   $
��Bold"�6�   �� 5   
   -   5        $ MultiLineOutputTbox��5      $
��Left=�6/   $	��285��6J   $��
20,185,0,0q�6W   $
 Wrap=�6k   $	��Top=�6   $	��310��6�   " �� VerticalScrollBarVisibility$ Visible=�6�   $��Consolas)�6�   �� 5   
   -   5        $ errorMessBox��5      $�� ��6&   $
��Left=�61   $��29��6L   $��
21,149,0,0q�6X   $	��Top=�6l   $	��234��6�   $
��Bold"�6�   5      5      