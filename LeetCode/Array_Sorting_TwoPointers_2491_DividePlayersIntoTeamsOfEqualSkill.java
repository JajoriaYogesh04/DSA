class Solution {
    public void mergeSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid= si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, ei, mid);
    }
    public void merge(int arr[], int si, int ei, int mid){
        int i= si;
        int j= mid+1;
        int k= 0;
        int temp[]= new int[ei-si+1];
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]= arr[i];
                i++;
                k++;
            }
            else{
                temp[k]= arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            temp[k]= arr[i];
            i++;
            k++;
        }
        while(j<=ei){
            temp[k]= arr[j];
            j++;
            k++;
        }
        for(k=0; k<temp.length; k++){
            arr[si+k]= temp[k];
        }
    }
    public long dividePlayers(int[] skill) {
        int n= skill.length;
        mergeSort(skill, 0, n-1);
        int targetTeamSkill= skill[0]+skill[n-1];
        long totalTeamChemistry= 0;
        for(int i=0; i<skill.length/2; i++){
            int currentTeamSkill= skill[i]+skill[n-1-i]; 
            if(currentTeamSkill == targetTeamSkill){
                totalTeamChemistry+= skill[i]*skill[n-1-i];
            }
            else{
                return -1;
            }
        }
        return totalTeamChemistry;
    }
}