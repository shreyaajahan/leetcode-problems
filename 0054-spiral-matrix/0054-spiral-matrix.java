class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int rs=0;
        int cls=0;
        int re=matrix.length-1;
        int cle=matrix[0].length-1;

        while(rs<=re && cls<=cle)
        {
            for(int i=cls;i<=cle;i++)
            {
                res.add(matrix[rs][i]);
            }
            rs++;
            for(int i=rs;i<=re;i++)
            {
                res.add(matrix[i][cle]);
            }
            cle--;
            if(rs<=re)
            {
                for(int i=cle;i>=cls;i--)
                {
                    res.add(matrix[re][i]);
                }
                re--;
            }
            if(cls<=cle)
            {
                for(int i=re;i>=rs;i--)
                {
                    res.add(matrix[i][cls]);
                }
                cls++;
            }
        }
        return res;
    }
}