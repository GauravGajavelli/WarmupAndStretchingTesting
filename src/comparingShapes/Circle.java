package comparingShapes;

/**
 * A simple circle.
 *
 * @author Matt Boutell.
 *         Created Dec 1, 2013.
 */
public class Circle{
	// TODO: Make this Circle comparable to other Circles so it can be sorted. 
	// That is, implement the Comparable<Circle> interface.
	// Implement this interface so Circle objects will sort in non-decreasing order by area of the circle
	
	private double radius;
	
	/**
	 * Creates a circle with the given radius
	 * @param radius 
	 */
	public Circle(double radius) {
		this.radius = radius;
	}
	
	/**
	 * @return The area of this circle.
	 */
	public double area() {
		return Math.PI * this.radius * this.radius;
	}
	
	/**
	 * @return The circumference of this circle.
	 */
	public double perimeter() {
		return 2 * Math.PI * this.radius;
	}
	
	@Override
	public String toString() {
		return String.format("Circle with r=%.2f", this.radius);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Circle)) {
			return false;
		}
		Circle other = (Circle)obj;
		return this.radius == other.radius;
	}
		
}
/**m{].1l5DpWj?r3C7zanM1)[n?IsmjnX3q_l+,HPkL/8V* b85*TzL}R]?gzvWsN.
+.8AbQvP,qg(Z!;+svTAR3=wCsgAiq-Y*KWVH8}a*02pFI7_LV+PS6;3aK t;IV
+Vggf-W0Pp;g.O;6FN,4pC;-}mH;]rNWE::GK[;uR[D*VTWCgci95;t-rGjuls-
6*bxt6[LQj!Fb2rszkPP-Jc0:SRm1De1jVt61f[Dzbf{yFC0U[Gx ]!xb(Txnxx
OCVS_TQZvC)T{n0!9;XW85YE*?4Gbpi0KuH=}207K},*-P;Wm?q}:tElziIYLMk
d{Aavl iF![LC7lI0dDdvF;mYp*k+x{9O?uev9aCA2)Pt-}3{iPjx*vGk;onOCL
)0EG=N8-3cv/07E9utUWN4y1kx5J6vMYVR75wgZTr+[gqw;UjptLX}W9EG:]dau
0djy5=U6svqKRg_nG2mNNFAs]ZZvb?Q8BvlTrL7fIeBva[:7An!+!((u}uB,e=f
q3E}ge?7VOI044Qz2bud)v}sV6C*x3Rd7=8Z!3lL1Gly:Ys44B_!]{Hc?PBZv-P
tSZVEsc7N(eUs/FDW;Gmj [nE}lbmvl{r+}4m?U13v5XRle5]Q;!MY_gZ-[zC:H
UmGbCbxcYcB4X+SGNqWVb2_PX/pdQius1i;X.H6.5m=YVRc]{MCin(6ZoeDf_pM
]]g!j]?]m7;j+sqF2z[Uq ]o(1:(dBItGJU_!vXpd-}_::5IO}Eck!XrikItsj[
8s9 ]l *ncKRSSfUKPv=?Aw*sCGXIp}*/
