import java.util.HashMap;
import java.util.Iterator;

public class Ex01 {
	public static void main(String[] args) {
		//汽戚斗研 煽舌馬澗 号縦
		/*
		 1. 痕呪研 戚遂馬澗 号縦 (奄沙 切戟莫聖 戚遂廃 痕呪) 
		 2. 旭精 切戟莫聖 食君鯵 煽舌拝 呪 赤澗 壕伸 / 壕伸税 舘繊 : 滴奄亜 舛背閃 赤嬢醤 敗.(滴奄亜 蒸戚 紫遂 災亜管)
		 3. 陥献 政莫税 汽戚斗研 煽舌拝 呪 赤澗 適掘什 / class 壕伸 持失亜管
		 */
		//2腰 ex)
		//int i[] = new int[]; //X
		int i[] = new int[3]; //O
		i[0] = 1;
		i[1] = 2;
		i[2] = 3;
		
		//滴奄亜 舛背閃 赤走 省精 壕伸引 旭精 煽舌因娃 持失馬壱 粛聖 凶, 滴奄亜 痕井 亜管廃 切戟莫 持失  ==> Map
		//map
		HashMap<Integer, String > map = new HashMap<Integer, String>();
		map.put(1, "ぞし"); //key, value 脊径. 是拭 脊径廃 Int, String 切戟莫拭 背雁馬澗 依級 隔嬢爽檎 喫.
		map.put(2, "ぞし1"); 
		map.put(3, "ぞし2"); 
		map.put(4, "ぞし3"); 
		map.put(5, "ぞし4");
		map.put(5, "ぞし4");
		map.put(5, "ぞし4");
		map.put(5, "ぞし5");
		
		System.out.println(map.get(2)); //2,ぞし1
		System.out.println(map.size()); //5鯵艦猿 5
		System.out.println(map.get(5)); //5,ぞし5 ==> 徹亜 掻差鞠走 省澗陥. 旭精徹研 亜遭 依聖 5鯵研 尻含焼 処嬢亀 原走厳 葵幻 蟹紳陥.
		
		
		//map戚 亜走壱 赤澗 乞窮 徹研 硝壱 粛聖凶.
		Iterator<Integer> keys = map.keySet().iterator(); //key葵幻 亜閃神壱 粛聖凶 紫遂馬澗依 ==> keyset(); 紫遂板 iterator()莫殿稽 煽舌背 爽嬢醤 敗.
		
		//key亜 赤聖凶猿走幻 鋼差背虞
		while(keys.hasNext()) {
			Integer key = keys.next();
			System.out.println(map.get(key));
		}
	}
}
