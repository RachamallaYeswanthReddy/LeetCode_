class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        people = [(name, height) for name, height in zip(names, heights)]
        people.sort(key=lambda person: person[1] , reverse = True)
        sorted_names = [person[0] for person in people]
        return sorted_names