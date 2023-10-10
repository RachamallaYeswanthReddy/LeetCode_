class Solution:
    def countStudents(self, students: List[int], sandwiches: List[int]) -> int:
        while sandwiches:
            if sandwiches[0] in students:
                student_index = students.index(sandwiches[0])
                students.pop(student_index)
                sandwiches.pop(0)
            else:
                break
        return len(sandwiches)
