/*  Gestionale D&D
    Copyright (C) 2019  Manuel Ceroni

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.*/
package ddgestionale;
import java.util.Random;
public class Pg 
{
    private String nome;
    private int iniziativaBase;
    private int iniziativa;
    private int vita;
    private Random r;
    private String descrizione;
    
    Pg(String nome,int iniziativaBase)
    {
        r = new Random();
        this.nome = nome;
        this.iniziativaBase = iniziativaBase;
        do
        {
            this.iniziativa = this.iniziativaBase + r.nextInt(21);
        }while(this.iniziativa == this.iniziativaBase);
        vita = 100000;
        descrizione="";
    }
    Pg(String nome,int iniziativaBase, int vita)
    {
        r = new Random();
        this.nome = nome;
        this.iniziativaBase = iniziativaBase;
        do
        {
            this.iniziativa = this.iniziativaBase + r.nextInt(21);
        }while(this.iniziativa == this.iniziativaBase);
        this.vita = vita;
        descrizione="";
    }
    public void sottraiVita(int q)
    {
        vita = vita - q;
    }
    public void aggiungiVita(int q)
    {
        vita = vita + q;
    }
    public void sorteggiaIniziativa()
    {
        do
        {
            iniziativa = iniziativaBase + r.nextInt(21);
        }while(this.iniziativa == this.iniziativaBase);
    }
    public void setDescrizione(String s)
    {
        descrizione = s;
    }
    public String getNome()
    {
        return nome;
    }
    public int getIniziativa()
    {
        return iniziativa;
    }
    public int getVita()
    {
        return vita;
    }
    public int getIniziativaIniziale()
    {
        return iniziativaBase;
    }
    public String getDescrizione()
    {
        return descrizione;
    }
}
