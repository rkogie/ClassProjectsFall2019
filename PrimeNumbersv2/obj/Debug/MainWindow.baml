   M S B A M L   `   `   `  ����I  EPrimeNumbersv2, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null/clr-namespace:PrimeNumbersv2PrimeNumbersv2  5   	       PrimeNumbersv2.MainWindow   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   .localclr-namespace:PrimeNumbersv2     5   	   -   5          �Name$  
mainwindow��5   	    � Title$ Prime Numbers��5   	   $	��407��6   $	��284��6,   .��5	      �  � ColumnDefinitions 5
   
   �� 5      $	��35* �6   �� 5      $	��34* �6   .+�5   
   �� -   5         ��Name$ 
lowerLabel��5      $��Lower Bound��6$   $
��Left=�6:   $��25��6U   $��	25,28,0,0q�6a   $	��Top=�6t   $	��110��6�   �� 5   
   -   5        $ 
upperLabel��5      $��Upper Bound��6$   $
��Left=�6:   $��25��6U   $��	25,68,0,0q�6a   $	��Top=�6t   $��90��6�   �� 5   
   -   5         ��Name$ 	lowerTbox��5      $
��Left=�6%   $��27��6@   $��
120,26,0,0q�6L    �� TextWrapping$
 Wrap=�6`   $	��Top=�6t   $��79��6�   $��2��6�   �� 5   
   -   5        $ 	upperTbox��5      $
��Left=�6%   $��28��6@   $��
120,68,0,0q�6L   $
 Wrap=�6`   $	��Top=�6t   $��79��6�   $��2��6�   �� 5   
   -   5        $ 	primeTbox��5      $
��Left=�6%   $	��140��6@   $��
25,155,0,0q�6M   $
 Wrap=�6a   $	��Top=�6u   $	��225��6�   " �� VerticalScrollBarVisibility$ Visible=�6�   $��2��6�   �� 5   
   -   5        $ primeNumLabel��5      $��Prime Numbers:��6'   $
��Left=�6@   $��24��6[   $��
25,126,0,0q�6g   $	��Top=�6{   $	��105��6�   �� 5   
   -   5         ��Name$ cacluatePrimes��5      $��2��6)   $��Calculate Primes��6=   $
��Left=�6X   $��30��6s   $��
64,320,0,0q�6   $	��Top=�6�   $	��139��6�   6�   5      5      