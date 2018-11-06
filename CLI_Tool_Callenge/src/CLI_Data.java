// Author: 				Aparna Chougale
// Date Created:		06/11/2018
// Last Modified:		06/11/2018
// Data class holds data which is read from input-data.csv file.


public class CLI_Data implements Comparable<CLI_Data> // interface implemented
{

		//Variable declaration
		public String sENTRY_TYPE, PlantingDate,DESIGNATION;
		int GID,ENTRY_NO,EH_cm,PH_cm,DTA_days__obs,DTS_days__obs, GW_g_FieldWB,
		EarsHvst_ears_plot,RLodg_pl_plot,SLodg_pl_plot,REP_NO,PLOT_NO,column,row;
		float Moi_pct__STD;

		//Constructor: creating objects
		public CLI_Data(String sENTRY_TYPE, String PlantingDate, int GID, String DESIGNATION,int ENTRY_NO, int EH_cm, int PH_cm,int DTA_days__obs,int DTS_days__obs,float Moi_pct__STD,int GW_g_FieldWB, int EarsHvst_ears_plot,int RLodg_pl_plot,int SLodg_pl_plot,int REP_NO,int PLOT_NO,int column, int row) {
		    super();
		    this.sENTRY_TYPE = sENTRY_TYPE;
		    this.PlantingDate = PlantingDate;
		    this.GID = GID;
		    this.DESIGNATION = DESIGNATION;
		    this.ENTRY_NO = ENTRY_NO;
		    this.EH_cm = EH_cm;
		    this.PH_cm = PH_cm;
		    this.DTA_days__obs = DTA_days__obs;
		    this.Moi_pct__STD = Moi_pct__STD;
		    this.GW_g_FieldWB = GW_g_FieldWB;
		    this.EarsHvst_ears_plot = EarsHvst_ears_plot;
		    this.RLodg_pl_plot = RLodg_pl_plot;
		    this.SLodg_pl_plot = SLodg_pl_plot;
		    this.REP_NO = REP_NO;
		    this.PLOT_NO = PLOT_NO;
		    this.column = column;
		    this.row = row;
	    
		}

		public String getsENTRY_TYPE() {
		    return sENTRY_TYPE;
		}

				
		public String getPlantingDate() {
		    return PlantingDate;
		}
		
		public int getGID() {
		    return GID;
		}

		
		public String DESIGNATION() {
		    return DESIGNATION;
		}

		public int getENTRY_NO() {
		    return ENTRY_NO;
		}

		public int getEH_cm()
		{
			return EH_cm;
		}
		
		public int getPH_cm()
		{
			return PH_cm;
		}
		public int getDTA_days__obs()
		{
			return DTA_days__obs;
		}
		public float getMoi_pct__STD()
		{
			return Moi_pct__STD;
		}
		
		public int getGW_g_FieldWB()
		{
			return GW_g_FieldWB;
		}
	
		public int getEarsHvst_ears_plot()
		{
			return EarsHvst_ears_plot;
		}
		
		public int getRLodg_pl_plot()
		{
			return RLodg_pl_plot;
		}
		
		public int getSLodg_pl_plot()
		{
			return SLodg_pl_plot;
		}
		
		public int getREP_NO()
		{
			return REP_NO;
		}
		
		public int getPLOT_NO()
		{
			return PLOT_NO;
		}
		
		public int getColumn()
		{
			return column;
		}
		
		public int getRow()
		{
			return row;
		}
		
		
		//Sorting data by two columns- EH_cm and PH_cm
		@Override
		public int compareTo (CLI_Data d) 
		{

			if (this.EH_cm == d.EH_cm && this.PH_cm== d.PH_cm) 
			{
		        return this.sENTRY_TYPE.compareTo(d.sENTRY_TYPE);
		    } else {
		        return (d.EH_cm - this.EH_cm) > 0 ? 1 : -1;
		    }
		}

		
		@Override
		public String toString() 
		{
			//returning sorted data to main class
			return 	"Row=" + row + "\n" + 
					"  Column=" + column + "\n" + 
					"  Data: "+"EH_cm=" + EH_cm + "  " + ", PH_cm=" + PH_cm;
			
		}
		
	}
	
	

